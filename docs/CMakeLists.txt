################################################################################
#    Copyright (C) 2015 HPCC Systems.
#
#    All rights reserved. This program is free software: you can redistribute it and/or modify
#    it under the terms of the GNU Affero General Public License as
#    published by the Free Software Foundation, either version 3 of the
#    License, or (at your option) any later version.
#
#    This program is distributed in the hope that it will be useful,
#    but WITHOUT ANY WARRANTY; without even the implied warranty of
#    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#    GNU Affero General Public License for more details.
#
#    You should have received a copy of the GNU Affero General Public License
#    along with this program.  If not, see <http://www.gnu.org/licenses/>.
################################################################################

cmake_minimum_required(VERSION 2.8)
PROJECT(hpcc4j-docs)

if(NOT DOC_VERSION)
	execute_process(
		COMMAND "grep" "-m 1" "<version>" "${CMAKE_CURRENT_SOURCE_DIR}/../pom.xml"
		COMMAND "sed" "s/[ ]*<version>//"
		COMMAND "sed" "s/-[0-9]*[^0-9][^0-9]*<\\/version>$//"
		WORKING_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR}
		OUTPUT_VARIABLE version
		RESULT_VARIABLE version_rv
		)
	if("${version_rv}" GREATER "0")
		message(FATAL_ERROR "error fetching version, please set manually")
	endif()
	string(STRIP "${version}" version)
	execute_process(
	COMMAND "grep" "-m 1" "<version>" "${CMAKE_CURRENT_SOURCE_DIR}/../pom.xml"
	COMMAND "sed" "s/[ ]*<version>[0-9]*.[0-9]*.[0-9]*-//"
	COMMAND "sed" "s/[-][^0-9]*<\\/version>$//"
	WORKING_DIRECTORY ${CMAKE_CURRENT_SOURCE_DIR}
	OUTPUT_VARIABLE stagever
	RESULT_VARIABLE stagever_rv
	)
	if("${stagever_rv}" GREATER "0")
		set(stagever "0")
	endif()
	string(STRIP "${stagever}" stagever)
    set(DOC_VERSION "${version}")
endif()
message("Building doc version: ${DOC_VERSION}")
define_property(GLOBAL PROPERTY DOC_TARGETS BRIEF_DOCS "docs" FULL_DOCS "docs")
mark_as_advanced(DOC_TARGETS)

include(${CMAKE_MODULE_PATH}/docMacros.cmake)

set (DOCBOOK_RESOURCES ${CMAKE_CURRENT_BINARY_DIR}/resources)
set (DOCBOOK_XSL ${CMAKE_CURRENT_BINARY_DIR}/resources/docbook-xsl)
set (DOC_IMAGES ${CMAKE_CURRENT_SOURCE_DIR}/)
set (XML_CATALOG ${CMAKE_CURRENT_BINARY_DIR}/BuildTools/catalog.xml)
set (FO_XSL ${CMAKE_CURRENT_BINARY_DIR}/BuildTools/fo.xsl)
set (VERSION_DIR ${CMAKE_CURRENT_BINARY_DIR}/)

# Build image file list to add to source watch.
file(GLOB_RECURSE DOC_IMAGES_LIST images/*)

# Required directories to add.
add_subdirectory(common)
add_subdirectory(BuildTools)
add_subdirectory(resources)

# modified for H2h repo
# Doc dirs to include.
add_subdirectory(HPCC4J_doc)

GET_PROPERTY(_targets GLOBAL PROPERTY DOC_TARGETS)
add_custom_target(docs ALL DEPENDS ${_targets})
