/*
Case Sensitive = reconhece letras maiusculas e minusculas

por Tag: getElementByTagName()
por Id: getElementById()
por Nome: getElementsByName()
por Classe: getElementsByClassName()
por Seletor: querySelector()
*/

let nome = window.document.getElementById('nome')
let email = document.querySelector('#email')
let assunto = document.querySelector('#assunto')
let nomeOk = false
let emailOk = false
let assuntoOk = false
let mapa = document.querySelector('#mapa')

function validaNome() {

   let txtNome = document.querySelector('#txtNome')
   if (nome.value.length < 3) {

      nome.style.border = 'solid 2px';
      nome.style.borderColor = "red";
      txtNome.innerHTML = 'Nome Inválido'
      txtNome.style.color = 'red'
      txtNome.style.fontSize = '14px'

   } else {
      txtNome.innerHTML = ''
      nome.style.border = 'solid 2px';
      nome.style.borderColor = '#32CD32';
      nomeOk = true
   }

}

function validaEmail() {
   let txtEmail = document.querySelector('#txtEmail') 

   if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1 ) {
      email.style.border = 'solid 2px';
      email.style.borderColor = "red";
      txtEmail.innerHTML = 'E-mail inválido'
      txtEmail.style.color = 'red'
      txtEmail.style.fontSize = '14px'

   } else {
      txtEmail.innerHTML = ''
      email.style.border = 'solid 2px';
      email.style.borderColor = '#32CD32';
      emailOk = true
   }
}

function validaAssunto() {
   let txtAssunto = document.querySelector('#txtAssunto')

   if (assunto.value.length >= 100) {
      txtAssunto.innerHTML = 'Texto é muito grande, digite no máximo 100 caracteres'
      txtAssunto.style.color = 'red'
      txtAssunto.style.fontSize = '14px'
      txtAssunto.style.display = 'block'
      assunto.style.border = 'solid 2px';
      assunto.style.borderColor = 'red';

   } else {
      assunto.style.border = 'solid 2px';
      assunto.style.borderColor = '#32CD32';
      txtAssunto.style.display = 'none'
      assuntoOk = true
   }
}

function enviar() {
   if (nomeOk == true && emailOk == true) {
      alert ('Formulário enviado com sucesso!')
   } else {
      alert ('Preencha o formulário corretamente antes de enviar...')
   }
}

function mapaZoom() {
   mapa.style.width = '800px'
   mapa.style.height = '600px'
}

function mapaNormal() {
   mapa.style.width = '400px'
   mapa.style.height = '250px'
}