#REST Java Template
This template shows you and helps you deploying a simple RESTfull API using:

* [gson](https://code.google.com/p/google-gson/)
* [jersey](https://jersey.java.net)

## Running this example:
All you need to start running this example is to replace the placeholder `{{MODELNAME}}` and `{{MODELNAME_B}}` with your modelname in every file of this template. All you have to do is configure the `replacer.sh` with your modelname, host and template path and run it. Thats all!

## API Blueprint

Have a look at the `API_blueprint.md`. In this file you can see a completed and valid [apiary](http://apiary.io) API blueprint. as mentioned in Running this example - all you have to do is replacing the placeholder and copy the content into your [apiary](http://apiary.io) doc.

## Templates

### Basic Controller

In the `Controller.java` there is only a basic controller available, because if you need a specific relationship between another model we can't add it in this default template. Also be sure that you implement your `GET`, `POST`, `PUT` and `DELETE` functions with the response status you can find inside every function.

### Basic Model

In the `Model.java` you can see that this little piece of nothing is only a POJO.

### Response Models

#### ErrorContainer

In the class `ErrorContainer.java` you can see a default implementation of a valid and good looking error object in javascript. This will also be send in the basic controller as real message for failure.

#### ModelContainer

If you are looking at the `ModelContainer.java` you will see that in this class we have a lot placeholders because this class will represent your real model for the communication with the client. One (with the `s` at the end) for multiValue (collection) and one for a singleValue.

## GsonMessageBodyHandler

This class will work as a provider for application/json requests for jersey. But make sure you configure it in your `web.xml` like:

		<servlet>
			...
			<init-param>
	            <param-name>jersey.config.server.provider.packages</param-name>
	      		<param-value>
	      			at.da.rest.example.controller,
	      			at.da.rest.example.util
	      		</param-value>
	        </init-param>
			<init-param>
			    <param-name>jersey.config.server.provider.scanning.recursive</param-name>
			    <param-value>false</param-value>
			</init-param>
			...
		</servlet>