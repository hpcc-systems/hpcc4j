wsclient utils
==============

## WS Interface Update Tool
This utility updates the WsClient web service client interface to match the latest interface as defined by the target version of ESP

### Dependancies

- Python 3
#### ESP based solution
- Running HPCC instance with accessible ESP
  
#### ESDL based solution
- git client tool - Clones HPCC-Platform and HPCC4J locally
- esdl - HPCC-Platform's esdl client tool, included in client tools install package, or can be built from source Should be on system path.

### Usage

```console
usage: generate-wsdl [-h] [-s SERVICE] [-b BRANCH] [-u USER] [-v] [-d] [-l] [-e]

optional arguments:
  -h, --help            show this help message and exit
  -s SERVICE, --service SERVICE
                        
                                    Service to target for wsdl generation
                                    default: all
                                    example: wsdfu
                                    
  -b BRANCH, --branch BRANCH
                        
                                    Branch to target for wsdl generation
                                    default: master
                                    example: hpcc4j-8.8.X
                                    
  -u USER, --user USER  
                                    User for repository fetch
                                    default: hpcc-systems
                                    example: mygithubusername
  -t HPCCHOST, --targethpcchost HPCCHOST
                                    Running HPCC host to fetch WSDLs
                                    default: localhost
  -p HPCCPORT, --hpccport HPCCPORT  Running HPCC Port to fetch WSDLs
                                    default: 8010
          
  -v, --verbose         Give more verbose information
  -d, --debug           Ouput debugging information
  -l, --list-services   List available services for stubcode generation
  -e, --esdlwsdl        Generate WSDLs from ESDL
```

Example usage: 

```console
python3 generate-wsdl -s wssmc
```

The above example fetches WSDLs from ESP on http://localhost:8010, determines if wssmc's interface has been updated in HPCC-Platform/esp.
If wssmc has been updated, the latest WSDL is generated, latest stub code and wrappers are generated.


```console
python3 generate-wsdl -b candidate-9.0.x -s wssmc -e
```

The above example clones HPCC-Platform and HPCC4J's candidate-9.0.x branches, determines if wssmc's interface has been updated in HPCC-Platform/esp.
If wssmc has been updated, the latest WSDL is generated, latest stub code and wrappers are generated.

 

