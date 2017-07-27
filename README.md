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

* To build a module, open the Gradle Tasks for the module and run the build/build task.

* To deploy a module, open the Gradle Tasks for the module and run the build/deploy task.

* To rebuild services, open the Gradle Tasks for the service module and run the build/buildService task.


### Contribution guidelines ###

### Who do I talk to? ###