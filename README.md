# dio-experts

Verificar a saúde do projeto
> http http://localhost:8080/actuator/health

Fazer um POST
> http POST http://localhost:8080/product id=1 name=TV amount=10

Verificar registro no Elastic Search
> http  http://localhost:9200/product/catalog/1

Buscar todos os registros
> http GET http://localhost:9200/product/catalog/_search/
 