# API REST COM SPRING BOOT MYSQL E FLYWAY e DOCKER .

Para rodar projeto precisa ter um database criado no mysql chamado fuel.
após inicializar o flyway cria a migration da table tb_consume.

Dockerfile configurado basta rodar os comando de criação de imagem e rodar o container;

# endpoint

### [LISTAR PORTADORES] -> http://localhost:8080/v1/consumption

### [INCLUIR PORTADOR] -> http://localhost:8080/v1/consumption

### [ALTERAR PORTADOR] -> http://localhost:8080/v1/consumption/{id}

### [EXCLUIR PORTADOR] -> http://localhost:8080/v1/consumption/{id}

### METODO POST INCLUIR PORTADOR

### http://localhost:8080/v1/consumption

{
"capacity": 50,
"carrier": "mateus",
"liters": 40
},

{
"capacity": 15,
"carrier": "evandro",
"liters": 25
},

{
"capacity": 10,
"carrier": "lucas",
"liters": 20
}

### rodar projeto

### criar uma imagem docker

### docker build --tag test-spring-boot .

### run projeto

### docker run --name backend-java -p 8080:8080 -d test-spring-boot

![test-ok](https://user-images.githubusercontent.com/39178001/234638407-c40d9a9c-e7de-4575-be23-389c3728f8ef.gif)
