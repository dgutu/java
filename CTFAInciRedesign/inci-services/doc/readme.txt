How to update the Avectra WSDL webservice client:

1. get wsdl URL from Avectra
2. after run the following command from command line:
wsimport -d c:\Templar\CTFAInciRedesign\Avectra\2014\ -extension -keep -XadditionalHeaders http://64.211.220.55/nfpcpctest/xweb/secure/pcpcxml.asmx?wsdl
3. after copy generated web client to C:\Templar\CTFAInciRedesign\Redesign\implementation\Java\trunk\inci-services\src\main\java\com\avectra\_2005\
4. check the code if need changes something
5. compile the project

Look into c:\Templar\CTFAInciRedesign\Avectra\2014\

C:\Templar\CTFAInciRedesign\Avectra\2014>wsimport -version
JAX-WS RI 2.1.6 in JDK 6

C:\Templar\CTFAInciRedesign\Avectra\2014>


New avectra update date 10 nov 2014