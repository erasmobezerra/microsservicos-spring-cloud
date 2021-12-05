# Microsserviços com Spring CLoud

##
## Elasticsearch no Docker
Baixando imagem e criando instância do Elasticsearch
> docker run -d --name elasticsearch -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" elasticsearch:6.6.2

Verificar a saúde do projeto startado
> http http://localhost:8080/actuator/health

Fazer um POST 
> http POST http://localhost:8080/product id=1 name=TV amount=10

Verificar registro direto na porta do ElasticSearch
> http  http://localhost:9200/product/catalog/1

Buscar todos os registros na porta do ElasticSearch
> http GET http://localhost:9200/product/catalog/_search/
 
##
## Redis no Docker
Baixando imagem e criando instância do Redis
> $ docker run --name redis-server -d redis

Acessando Redis CLI
> $ docker run -it --link redis-server:redis --rm redis redis-cli -h redis -p 6379

Verificando saúde do projeto startado
> http http://localhost:8082/actuator/health

Metodos Http, testando a API conectada ao Redis
> http POST http://localhost:8082/cart/123 productId=1 amount=1

> http DELETE http://localhost:8082/cart/123 productID=1

> http GET http://localhost:8082/cart/123 

##
## Gateway
Acessando pelo Gateway o banco do Shopping-cart
> http://localhost:8080/cart/123
> http://localhost:8082/cart/123

Acessando pelo Gateway o banco do Product-catalog
> http://localhost:8080/product/1
> http://localhost:8081/product/1


## Sequência de Boot Run dos Microsserviços:
- config-server
- service-discovery
- product-catalog e/ou shopping-cart
- gateway