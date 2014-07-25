FORMAT: 1A
HOST: {{HOSTNAME}}

# {{MODELNAME}}-RESTController
The {{MODELNAME}}-RESTController will show you how easy it is to create a wonderfull and awesome RESTfull API.

## {{MODELNAME}} Collection [/{{MODELNAME}}s]
A Collection of {{MODELNAME}} 

### List all {MODELNAME}}s [GET]
+ Response 200 (application/json)

        {
            "{{MODELNAME}}s":
            [
                {
                    "id":1,
                    "property":"property"
                },
                {
                    "id":2,
                    "property":"property"
                },
                {
                    "id":3,
                    "property":"property"
                }
            ]
        }

### Create a {{MODELNAME}} [POST]
+ Request (application/json)

        {
            "{{MODELNAME}}":
            {
                "id":1,
                "property":"property"
            }
        }

+ Response 200 (application/json)

### Removes {{MODELNAME}}s [DELETE]
+ Response 204


## {{MODELNAME}} [/{{MODELNAME}}s/{id}]
A single {{MODELNAME}} object with all its details

+ Parameters
    + id (required, number, `1`) ... Numeric `id` of the {{MODELNAME}} to perform action with.

### Retrieve {{MODELNAME}} [GET]
+ Response 200 (application/json)

        {
            "{{MODELNAME}}":
            {
                "id":1,
                "property":"property"
            }
        }
        
### Update {{MODELNAME}} [PUT]
+ Response 200 (application/json)

        {
            "{{MODELNAME}}":
            {
                "property":"property1"
            }
        }

### Remove {{MODELNAME}} [DELETE]
+ Response 204
