function login() {
    let user = document.getElementById("txtUser").value
    let senha = document.getElementById("txtSenha").value

    let usuario = {
        email:user,
        senha:senha
    }

    let mensagem = {
        method: 'POST',
        body: JSON.stringify(usuario),
        headers : {
            'Content-type' : 'application/json'
        }
    }

    fetch("http://localhost:8080/user/loginemail", mensagem)
        .then(res => validaLogin(res))
    
}

function validaLogin(resultado) {
    if (resultado.status == 200) {
        resultado.json().then(res => efetuaLogin(res))
    } else {
        console.log("falha no login")
    }
}

function efetuaLogin(usuario) {
    // console.log("Entrando com ", usuario)
    localStorage.setItem("userLogged", JSON.stringify(usuario))
    window.location = "consulta.html"
}