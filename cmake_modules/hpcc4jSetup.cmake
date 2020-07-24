################################################################################
#    Copyright (C) 2011 HPCC Systems.
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

# File  : commonSetup.cmake
#
#########################################################
# Description:
# ------------
# sets up various cmake options. 
#########################################################

IF ("${COMMONSETUP_DONE}" STREQUAL "")
  SET (COMMONSETUP_DONE 1)

  MACRO (MACRO_ENSURE_OUT_OF_SOURCE_BUILD _errorMessage)
    STRING(COMPARE EQUAL "${CMAKE_SOURCE_DIR}" "${CMAKE_BINARY_DIR}" insource)
    IF (insource)
      MESSAGE(FATAL_ERROR "${_errorMessage}")
    ENDIF(insource)
  ENDMACRO (MACRO_ENSURE_OUT_OF_SOURCE_BUILD)

  macro_ensure_out_of_source_build("The LexisNexis Hpcc requires an out of source build.
    Please remove the directory ${CMAKE_BINARY_DIR}/CMakeFiles 
    and the file ${CMAKE_BINARY_DIR}/CMakeCache.txt,
    then create a separate build directory and run 'cmake path_to_source [options]' there.")

  cmake_policy ( SET CMP0011 NEW )

  option(USE_NATIVE_LIBRARIES "Search standard OS locations for thirdparty libraries" ON)
  #option(USE_GIT_DESCRIBE "Use git describe to generate build tag" ON)
  option(CHECK_GIT_TAG "Require git tag to match the generated build tag" OFF)
  option(MAKE_DOCS "Create documentation at build time." OFF)
  option(MAKE_DOCS_ONLY "Create a base build with only docs." OFF)
  #option(DOCS_DRUPAL "Create Drupal HTML Docs" OFF)
  #option(DOCS_EPUB "Create EPUB Docs" OFF)
  #option(DOCS_MOBI "Create Mobi Docs" OFF)

  if ( MAKE_DOCS_ONLY )
    set( MAKE_DOCS ON )
  endif()

 

  # This Macro is provided as Public domain from 
  # http://www.cmake.org/Wiki/CMakeMacroParseArguments
  MACRO(PARSE_ARGUMENTS prefix arg_names option_names)
    SET(DEFAULT_ARGS)
    FOREACH(arg_name ${arg_names})    
      SET(${prefix}_${arg_name})
    ENDFOREACH(arg_name)
    FOREACH(option ${option_names})
      SET(${prefix}_${option} FALSE)
    ENDFOREACH(option)

    SET(current_arg_name DEFAULT_ARGS)
    SET(current_arg_list)
    FOREACH(arg ${ARGN})            
      SET(larg_names ${arg_names})    
      LIST(FIND larg_names "${arg}" is_arg_name)                   
      IF (is_arg_name GREATER -1)
        SET(${prefix}_${current_arg_name} ${current_arg_list})
        SET(current_arg_name ${arg})
        SET(current_arg_list)
      ELSE (is_arg_name GREATER -1)
        SET(loption_names ${option_names})    
        LIST(FIND loption_names "${arg}" is_option)            
        IF (is_option GREATER -1)
          SET(${prefix}_${arg} TRUE)
        ELSE (is_option GREATER -1)
          SET(current_arg_list ${current_arg_list} ${arg})
        ENDIF (is_option GREATER -1)
      ENDIF (is_arg_name GREATER -1)
    ENDFOREACH(arg)
    SET(${prefix}_${current_arg_name} ${current_arg_list})
  ENDMACRO(PARSE_ARGUMENTS)

  # This macro allows for disabling a directory based on the value of a variable passed to the macro.
  #
  # ex. HPCC_ADD_SUBDIRECORY(roxie ${CLIENTTOOLS_ONLY})
  #
  # This call will disable the roxie dir if -DCLIENTTOOLS_ONLY=ON is set at config time.
  #
  macro(HPCC_ADD_SUBDIRECTORY)
    set(adddir OFF)
    PARSE_ARGUMENTS(_HPCC_SUB "" "" ${ARGN})
    LIST(GET _HPCC_SUB_DEFAULT_ARGS 0 subdir)
    set(flags ${_HPCC_SUB_DEFAULT_ARGS})
    LIST(REMOVE_AT flags 0)
    LIST(LENGTH flags length)
    if(NOT length)
      set(adddir ON)
    else()
      foreach(f ${flags})
        if(${f})
          set(adddir ON)
        endif()
      endforeach()
    endif()
    if ( adddir )
      add_subdirectory(${subdir})
    endif()
  endmacro(HPCC_ADD_SUBDIRECTORY)

  #set ( SCM_GENERATED_DIR ${CMAKE_BINARY_DIR}/generated )
  #include_directories (${SCM_GENERATED_DIR})

  ##################################################################

  # Build tag generation

  set(projname ${HPCC_PROJECT})
  set(majorver ${HPCC_MAJOR})
  set(minorver ${HPCC_MINOR})
  set(point ${HPCC_POINT})
  if ( "${HPCC_MATURITY}" STREQUAL "release" )
    set(stagever "${HPCC_SEQUENCE}")
  else()
    set(stagever "${HPCC_SEQUENCE}${HPCC_MATURITY}")
  endif()
  set(version ${majorver}.${minorver}.${point})

  IF ("${CMAKE_BUILD_TYPE}" STREQUAL "Debug")
    set( stagever "${stagever}-Debug" )
  ENDIF ("${CMAKE_BUILD_TYPE}" STREQUAL "Debug")

  # External library setup - some can be optionally selected based on USE_xxx flags, some are required

  IF (MAKE_DOCS)
    find_package(XSLTPROC)
    IF (XSLTPROC_FOUND)
      add_definitions (-D_USE_XSLTPROC)
    ELSE()
      message(FATAL_ERROR "XSLTPROC requested but package not found")
    ENDIF()
    find_package(FOP)
    IF (FOP_FOUND)
      add_definitions (-D_USE_FOP)
    ELSE()
      message(FATAL_ERROR "FOP requested but package not found")
    ENDIF()
  ENDIF(MAKE_DOCS)

  ###########################################################################
  ###
  ## The following sets the install directories and names.
  ###
 

  MACRO (FETCH_GIT_TAG workdir edition result)
      execute_process(COMMAND "${GIT_COMMAND}" describe --tags --dirty --abbrev=6 --match ${edition}*
        WORKING_DIRECTORY "${workdir}"
        OUTPUT_VARIABLE ${result}
        ERROR_QUIET
        OUTPUT_STRIP_TRAILING_WHITESPACE)
        if ("${${result}}" STREQUAL "")
            execute_process(COMMAND "${GIT_COMMAND}" describe --always --tags --all --abbrev=6 --dirty --long
                WORKING_DIRECTORY "${workdir}"
                OUTPUT_VARIABLE ${result}
                ERROR_QUIET
                OUTPUT_STRIP_TRAILING_WHITESPACE)
        endif()
  ENDMACRO()

endif ("${COMMONSETUP_DONE}" STREQUAL "")
