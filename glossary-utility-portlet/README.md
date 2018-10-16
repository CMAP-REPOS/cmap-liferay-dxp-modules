Send package to server
----------------------
scp -P 26 build/libs/com.cmap.portlets.custom.glossary.utility-1.0.0.jar thirst@localhost:~

Deploy on server
----------------
sudo chown jboss:adm com.cmap.portlets.custom.glossary.utility-1.0.0.jar && sudo mv com.cmap.portlets.custom.glossary.utility-1.0.0.jar /webapps/qa-liferay-4p/liferay-dxp-digital-enterprise-7.0-sp4/deploy/