let wins = 100
let losses = 47
const result = rank(wins, losses)

function rank(wins, losses) {
    let matches = wins - losses
    let nivel
    
    if (matches < 10) {
        nivel = "Ferro"
    } else if (matches >= 11 && matches <= 20) {
        nivel = "Bronze"
    } else if (matches >= 21 && matches <= 50) {
        nivel = "Prata"
    } else if (matches >= 51 && matches <= 80) {
        nivel = "Ouro"
    } else if (matches >= 81 && matches <= 90) {
        nivel = "Diamante"
    } else if (matches >= 91 && matches <= 100) {
        nivel = "Imortal"
    } else if (matches >= 101) {
        nivel = "Ascendente"
    }

    return `O herói tem saldo de ${matches} está no nível de ${nivel}`
}    

console.log(result);