# Consuming a Soap Web Service From Java

Este proyecto muestra un ejemplo del consumo de un servicio web SOAP desde Java. 

Para la generación de las clases cliente, se hace uso del comando wsimport. A continuación se muestra el uso del comando.

**wsimport**: comando para generar las clases cliente para el consumo del servicio SOAP desde Java.

**Ejemplo de uso**:
Ubicarse en el directorio src/main/java
wsimport -keep http://www.dneonline.com/calculator.asmx?wsdl
