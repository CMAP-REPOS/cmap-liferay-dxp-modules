# README #

### What is this repository for? ###

This repository contains module projects for the CMAP Liferay DXP instance.

### How do I get set up? ###

#### Clone the repository 

Clone this repository into your Liferay `modules` directory.

`git clone git@bitbucket.org:workstate-code/cmap-liferay-dxp-modules.git .`
		
or 
		
`git clone https://[user]@bitbucket.org/workstate-code/cmap-liferay-dxp-modules.git .`
		
The "." at the end of the git command will clone the contents of the project into your current directory, without creating the `cmap-liferay-dxp-modules` directory.

#### Refresh workspace

In Liferay Developer Studio, refresh your workspace, then right-click your workspace and select **Gradle** --> **Refresh Gradle Project**. You should see new tasks appear in the Gradle Tasks pane.

If you get an error about the project being out of synch with the file system, try  deleting the ".project" file in your modules directory, then re-running **Refresh Gradle Project**.

#### Read some documentation

Check out [Portlets](https://dev.liferay.com/develop/tutorials/-/knowledge_base/7-0/portlets) and [Service Builder](https://dev.liferay.com/develop/tutorials/-/knowledge_base/7-0/service-builder) in the Liferay documentation.

### How do I automatically build and deploy modules? ###

#### Add the project to your local server

Add the module project to your server's published resources.

You can drag the project from the **Project Explorer** to the server in the **Servers** pane, or right-click the server in the **Servers** pane and select **Add and Remove...** from the context menu.

Once the module is a published resource, Liferay Developer Studio will automatically build and deploy it any time files in the module are updated.

### How do I manually build and deploy modules? ###

#### Run the Gradle tasks

To build a module, open the Gradle Tasks for the module and run the "build/build" task.

To deploy a module locally, open the Gradle Tasks for the module and run the "build/deploy" task.

### How do I deploy a module to the server? ###

#### Clean and deploy the module locally
	
Open the Gradle Tasks for the module and run the "build/clean" and "build/deploy" tasks.
	
Copy the module's JAR file(s) from the project's workspace's `build/libs` directory to the `deploy` directory on the server. For the DXP sandbox, the path is `/webapps/liferay-4p/liferay-dxp-digital-enterprise-7.0-sp4/deploy`.

Update permissions on the remote JAR file(s) to make them writable -- 646 should work. 

Watch the logs to make sure the module has been successfully deployed. You should see lines similar to this in the logs: 

    17:46:25,631 INFO  [fileinstall-/webapps/liferay-2p/liferay-dxp-digital-enterprise-7.0-sp2/osgi/modules][BundleStartStopLogger:38] STOPPED custom.services-api_1.0.0 [536]
    17:46:25,784 INFO  [fileinstall-/webapps/liferay-2p/liferay-dxp-digital-enterprise-7.0-sp2/osgi/modules][BundleStartStopLogger:38] STOPPED custom.services-service_1.0.0 [537]
    17:46:26,137 INFO  [Refresh Thread: Equinox Container: a0e0c2f0-0a73-0017-15d1-964ebca560be][BundleStartStopLogger:35] STARTED custom.services-api_1.0.0 [536]
    17:46:26,565 INFO  [Refresh Thread: Equinox Container: a0e0c2f0-0a73-0017-15d1-964ebca560be][BundleStartStopLogger:35] STARTED custom.services-service_1.0.0 [537]

### Contribution guidelines ###

When in doubt, create a branch.

### Who do I talk to? ###

If you have any questions, ping jon.litfin@workstate.com.
