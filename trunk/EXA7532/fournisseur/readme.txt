Ce tuto est issu de :
* http://static.springsource.org/spring-ws/sites/1.5/reference/html/tutorial.html
** tutoriel standard de SpringWS
* http://blog.cloudwhiz.com/search/label/Google%20App%20Engine
** l'id�e original du hack
* http://manuel-palacio.blogspot.com/
** l'auteur du hack

Quelques am�nagements par rapport � la version initiale
* bien entendu modifier le nom de l'appli GAE dans appengine-web.xml
** <application>prodageo</application>
* mettre l'URL absolue dans spring-ws-servlet.xml
** <property name="locationUri" value="http://prodageo.appspot.com/holidayservice/"/>

Comment g�n�rer
* mvn compile
* mvn package => g�n�re C:\prodageo\EXA7532\target\holidayService.war
* d�zipper holidayService.war dans C:\prodageo\EXA7532\target\holidayService\
* charger sur GAE avec la commande
** C:\APPS\GAE\BIN\appcfg.cmd update C:\prodageo\EXA7532\target\holidayService

* r�cup�rer le WSDL sur l'URL
** http://prodageo.appspot.com/holidayservice/holiday.wsdl
* copier coller dans SoapUI et interroger
