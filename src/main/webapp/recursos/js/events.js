//Cambio de color en boton comenzar al pasar sobre el
let button = document.getElementsByClassName("comenzar")
button[0].addEventListener('mouseover', function () {
        button[0].style.background = "#6f42c1"
    }
)

//Hacemos que el color vuelva a su estado original
button[0].addEventListener('mouseout',function (){
    button[0].style.background = "#17a2b8"} //color info en Hexadecimal
)



