Code for external system integration

To update STT schema:
- Add the xsd file to cbp-schema/schema-xsd folder
- Add any additional binding files to the "binding" folder in cbp-schema/schema-xsd
- Update the pom file following the comments in the pom
- test by running mvn package

To update Service WSDL:
- Add the wsdl file to cbp-service/service-wsdl folder
- Update the pom file following the comments in the pom
- test by running mvn package
