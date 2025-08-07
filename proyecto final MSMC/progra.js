function factorial(num) {
    num = parseInt(num); // Convertir a entero
    if (isNaN(num) || num < 0) return "Error"; // Factorial no definido para negativos o no numéricos
    if (num === 0 || num === 1) return 1;
    let result = 1;
    for (let i = 2; i <= num; i++) {
        result *= i;
    }
    return result;
}

function toRadians(degrees) {
    return degrees * (Math.PI / 180);
}

const display = document.querySelector("#display");
const buttons = document.querySelectorAll("button");

buttons.forEach((btn) => {
    btn.addEventListener("click", () => {
        switch(btn.id){
            case "=":
                 try {
                let expression = display.value.replace("^", "**");
                display.value = eval(expression);
            } catch (e) {
                display.value = "Syntax error";
            }
                break;
            case "ac":
                display.value = "";
                break;  
            case "de":
                display.value = display.value.slice(0, -1);
                break;  
            case "cos":
                display.value = Math.cos(toRadians(display.value));
                break;
            case "sin":
                display.value = Math.sin(toRadians(display.value));
                break;
            case "tan":
                display.value = Math.tan(toRadians(display.value));
                break;
            case "sqrt":
                display.value = Math.sqrt(display.value);
                break;
            case "log":
                 display.value = Math.log10(display.value);
                break;
            case "!":
                 display.value = factorial(display.value);
                break;
            default:
                display.value += btn.id;
                break;
        }
    });
});