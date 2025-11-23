from abc import ABC, abstractmethod

# ------------------------------------------------
# Classes Fábrica

class Apresentação(ABC):

    @abstractmethod
    def pegar_instrumento(self) -> 'Instrumento':
        pass
    
    def fazer_performance(self):
        instrumento = self.pegar_instrumento()
        instrumento.afinar()
        instrumento.tocar()

class ApresentacaoGuitarra(Apresentação):

    def pegar_instrumento(self) -> 'Instrumento':
        return Guitarra()
    
class ApresentacaoPiano(Apresentação):

    def pegar_instrumento(self) -> 'Instrumento':
        return Piano()

# ------------------------------------------------
# Classes Produto

class Instrumento(ABC):
    @abstractmethod
    def tocar(self):
        pass

    @abstractmethod
    def afinar(self):
        pass


class Guitarra(Instrumento):
    def tocar(self):
        print("Tocando guitarra")

    def afinar(self):
        print("Afinando guitarra")


class Piano(Instrumento):
    def tocar(self):
        print("Tocando piano")
    
    def afinar(self):
        print("Afinando piano")


# ------------------------------------------------
# Código Cliente

if __name__ == "__main__":
    print("---- Factory Method Pattern ----")

    print("\nApresentação com Guitarra:")
    apresentacao_guitarra = ApresentacaoGuitarra()
    apresentacao_guitarra.fazer_performance()   

    print("\nApresentação com Piano:")
    apresentacao_piano = ApresentacaoPiano()
    apresentacao_piano.fazer_performance()
