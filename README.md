### Teste backend Consumo de Combustivel.

## endpoint

# [LISTAR PORTADORES] -> http://localhost:8080/v1/consumption

# [INCLUIR PORTADOR] -> http://localhost:8080/v1/consumption

# [ALTERAR PORTADOR] -> http://localhost:8080/v1/consumption/{id}

# [EXCLUIR PORTADOR] -> http://localhost:8080/v1/consumption/{id}

# METODO POST INCLUIR PORTADOR

==> http://localhost:8080/v1/consumption

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
