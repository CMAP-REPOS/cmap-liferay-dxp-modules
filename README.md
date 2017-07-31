# README #

### What is this repository for? ###

This repository contains module projects for the CMAP Liferay DXP instance.

### How do I get set up? ###

* Clone this repository into your Liferay "modules" directory.

        clone git@bitbucket.org:workstate-code/cmap-liferay-dxp-modules.git .

* Check out [Portlets](https://dev.liferay.com/develop/tutorials/-/knowledge_base/7-0/portlets) and [Service Builder](https://dev.liferay.com/develop/tutorials/-/knowledge_base/7-0/service-builder) in the Liferay documentation.

* In Liferay Developer Studio, refresh your workspace, then right-click your workspace and select Gradle --> Refresh Gradle Project. You should see new tasks appear in the Gradle Tasks pane.

  If you get an error about the project being out of synch with the file system, try  deleting the ".project" file in your modules directory, then re-running Refresh Gradle Project.
 
### How do I build and deploy modules? ###

* To build a module, open the Gradle Tasks for the module and run the "build/build" task.

* To deploy a module locally, open the Gradle Tasks for the module and run the "build/deploy" task.

* To deploy a module to the server:
	
	1. Open the Gradle Tasks for the module and run the "build/deploy" task.
	2. Copy the module's JAR file(s) from the workspace's "bundles/osgi/modules" directory to the "deploy" directory on the server. For the DXP sandbox, the path is /webapps/liferay-2p/liferay-dxp-digital-enterprise-7.0-sp2/deploy.
	3. Update permissions on the remote JAR file(s) to make them writable -- 646 should work. 
	4. Watch the logs to make sure the module has been successfully deployed. You should see lines similar to this in the logs: 

		> 17:46:25,631 INFO  [fileinstall-/webapps/liferay-2p/liferay-dxp-digital-enterprise-7.0-sp2/osgi/modules][BundleStartStopLogger:38] STOPPED custom.services-api_1.0.0 [536]
		> 17:46:25,784 INFO  [fileinstall-/webapps/liferay-2p/liferay-dxp-digital-enterprise-7.0-sp2/osgi/modules][BundleStartStopLogger:38] STOPPED custom.services-service_1.0.0 [537]
		> 17:46:26,137 INFO  [Refresh Thread: Equinox Container: a0e0c2f0-0a73-0017-15d1-964ebca560be][BundleStartStopLogger:35] STARTED custom.services-api_1.0.0 [536]
		> 17:46:26,565 INFO  [Refresh Thread: Equinox Container: a0e0c2f0-0a73-0017-15d1-964ebca560be][BundleStartStopLogger:35] STARTED custom.services-service_1.0.0 [537]

* To rebuild services, open the Gradle Tasks for the service module and run the "build/buildService" task.

### Contribution guidelines ###

### Who do I talk to? ###