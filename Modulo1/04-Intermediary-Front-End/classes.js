class User {
    constructor(nome, sobrenome) {
        this.nome = nome
        this.sobrenome = sobrenome
    }

    getFullName() {
        return this.nome + " " + this.sobrenome
    }

    get nomeCompleto() {
        return this.nome + " " + this.sobrenome
    }
}

var david = new User("David", "Barenco")
console.log(david.getFullName())
console.log(david.nomeCompleto)


class Admin extends User {

    constructor(nome, sobrenome, cargo) {
        super(nome, sobrenome)
        this.cargo = cargo
    }

    get getCargo() {
        return this.nome + " é " + this.cargo
    }
}

var admin = new Admin("David", "Contage", "Programador")
console.log(admin.getFullName())
console.log(admin.nomeCompleto)
console.log(admin.getCargo)