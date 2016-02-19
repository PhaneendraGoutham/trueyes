# trueyes

This project can be used as sample/reference implementation of Micro Service Architecture using Spring Boot,Cloud, technology stack.

## Security

Implemented on the lines of OAuht2 protocol using Spring Cloud Security module. The authorization server runs in its own process/port.
JWT token are issued by the authorazation server. Individual micro-service decodes the JWT token to 'Principal'.

## API Gateway

All the calls to RESTful services are routed using a gateway server implemented using Spring Boot Zuul module.


## Frontend / UI

The front-end is implemented using Angular 1.5, Yeoman (generator-cg-angular), Grunt, Bower.


## Contributing

1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :D
