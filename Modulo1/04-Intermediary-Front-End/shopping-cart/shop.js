var valorTotal = [0,0];
var valorProduto = [50.00, 30.00];
var qtd = [0,0];


function adicionarItem(item) {
    var quantidade = document.getElementById("quantidade" + item);
    var total = document.getElementById("total" + item);
    qtd[item]++;
    valorTotal[item] = qtd[item] * valorProduto[item];
    
    quantidade.innerHTML = qtd[item];
    total.innerHTML = valorTotal[item].toFixed(2);
    valorCompra();

}

function removerItem(item) {
    var quantidade = document.getElementById("quantidade" + item);
    var total = document.getElementById("total" + item);
    
    if (qtd[item] > 0) {
        qtd[item]--;
        valorTotal[item] = qtd[item] * valorProduto[item];
        
        quantidade.innerHTML = qtd[item];
        total.innerHTML = valorTotal[item].toFixed(2);
        valorCompra();
    }
}

function valorCompra() {
    var valorTotalCompra = document.getElementById("valorTotalCompra");
    var subtotal = 0

    for (var i = 0; i < valorTotal.length; i++) {
        subtotal += valorTotal[i];
    }
    valorTotalCompra.innerHTML = subtotal.toFixed(2);
}   

var name = document.get