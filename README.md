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

### Contribution guidelines ###

When in doubt, create a branch.

### Who do I talk to? ###

If you have any questions, ping jon.litfin@workstate.com.
