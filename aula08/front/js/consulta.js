function hello() {
    let numero
    numero = document.getElementById("chave").value
    let saida = document.getElementById("saida")
    saida.innerHTML = "Você digitou: " + numero
    console.log('Você digitou: ' + numero)
}

function consultaUsuario() {
    let numero
    numero = document.getElementById("chave").value

    const url = "http://localhost:8080/user/id/" + numero

    fetch(url)
    .then(res => validaResposta(res))

}

function validaResposta(resultado) {
    if (resultado.status == 200) {
        resultado.json().then(res => exibirDados(res))
                
    } else {
        document.getElementById("saida").innerHTML = "Não encontrado"
        
    }
}

function exibirDados(usuario) {
    document.getElementById("saida").innerHTML = '<b>' + usuario.nome + '</b> <br>' + usuario.email
}
