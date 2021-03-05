/*
function hello() {
    let numero
    numero = document.getElementById("chave").value
    let saida = document.getElementById("saida")
    saida.innerHTML = "Você digitou: " + numero
    console.log('Você digitou: ' + numero)
} */

function validaLogin() {
    let usuario = localStorage.getItem("userLogged")
    
    if (!usuario) {
        window.location = "login.html"
    }

    let objUser = JSON.parse(usuario)
    document.getElementById("dadosUser").innerHTML = 'Usuário: <b>' + objUser.nome + '</b> - Email: ' + objUser.email + '<br>'

}

function logout() {
    localStorage.removeItem("userLogged")
    window.location = "login.html"
}

function consultaUsuario() {
    let numero
    numero = document.getElementById("chave").value

    const url = "http://localhost:8080/user/compras/" + numero

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

    // function exibirDados(usuario) {    // exibe nome e email do usuário 
    // document.getElementById("saida").innerHTML = '<b>' + usuario.nome + '</b> <br>' + usuario.email

    function exibirDados(compras) {    // exibe lista de compras do usuário

    let tabela = '<table> <tr> <th>descrição</th> <th>valor</th> <th>data</th> </tr>'

    for (let index = 0; index < compras.length; index++) {
        let data = new Date(compras[index].data)    // transforma texto em objeto Date
        let dataFormatada = data.toLocaleDateString("pt-BR")
        tabela += `<tr> <td> ${compras[index].descricao} </td><td> ${compras[index].valor} </td><td> ${dataFormatada} </td><tr>`
     
     // tabela += compras[index].descricao + ' - ' + compras[index].valor + ' - ' + compras[index].data + '<br>'        
     // tabela += '<tr> <td>' + compras[index].descricao + '</td><td>' + compras[index].valor + '</td><td>' + compras[index].data + '</td><tr>'
    }
    tabela += '</table>'
    document.getElementById("saida").innerHTML = tabela    

}
