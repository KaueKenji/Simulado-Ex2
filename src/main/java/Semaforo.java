public class Semaforo{

  private EstadoSemaforo estado = EstadoSemaforo.Verde;
  

  void mudarProximo(){

    switch(estado){
      case Verde:{
        estado = EstadoSemaforo.Amarelo;
        break;
      }
        case Amarelo:{
          estado = EstadoSemaforo.Vermelho;
          break;
        }
        case Vermelho:{
          estado = EstadoSemaforo.Verde;
          break;
        }

        
    }
  }

  void mostrarEstado(){
  System.out.println("Semaforo: "+ estado);
  }

  void indicar(){
    switch(estado){
      case Verde:{
        System.out.println("Carro ande");
        break;
      }
        case Amarelo:{
          System.out.println("Carro desacelere");
          break;
        }
        case Vermelho:{
          System.out.println("Carro pare");
          break;
        }


    }
  }

  

  

  



  
}