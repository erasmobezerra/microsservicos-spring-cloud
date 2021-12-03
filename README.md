# dio-experts

Verificar a saúde do projeto
> http http://localhost:8080/actuator/health

Fazer um POST
> http POST http://localhost:8080/product id=1 name=TV amount=10

Verificar registro no Elastic Search
> http  http://localhost:9200/product/catalog/1

Buscar todos os registros
> http GET http://localhost:9200/product/catalog/_search/
 
### Redis Server
> $ sudo apt install redis-server
> $ sudo systemctl status redis
> $ redis-cli

Verificando saúde do projeto startado
> http http://localhost:8082/actuator/health

Metodos Http, testando a API com o Redis
> http POST http://localhost:8082/cart/123 productId=1 amount=1
> http DELETE http://localhost:8082/cart/123 
> http GET http://localhost:8082/cart/123 