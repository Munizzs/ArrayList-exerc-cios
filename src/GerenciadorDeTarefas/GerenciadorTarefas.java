package GerenciadorDeTarefas;

import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList <Tarefa> tarefas = new ArrayList<>();
    
    public void novaTarefa(Tarefa tarefa){      
        tarefas.add(tarefa);
    }
    
    public void lista(){
        int cont = 1;
        String sit=null;
        for(Tarefa show: tarefas){
            
            if(show.concluida==true){
                sit="Concluido";
            }else{
                sit="Pendente";
            }
            
            System.out.printf("\n#%d (%s) %s\n   %s\n",cont,sit,show.codigo,show.descricao);
            cont++;
        }
    }
    
    
    public void remover(int posicao){
        posicao = posicao-1;
        if(posicao>tarefas.size() || posicao<0){
            System.out.println("\nPosição Invalida");
        }else{
            tarefas.remove(posicao);
        }
    }
    
    public void alterar(int posicao, String codigo, String descricao){
        posicao = posicao-1;
        if(posicao>tarefas.size() || posicao<0){
            System.out.println("\nPosição Invalida");
        }else{
            Tarefa tarefa = tarefas.get(posicao);

            tarefa.codigo = codigo;
            tarefa.descricao = descricao;

            tarefas.set(posicao, tarefa);
        }
    }
    
    public void concluir(int posicao){
        posicao = posicao-1;
        if(posicao>tarefas.size() || posicao<0){
            System.out.println("\nPosição Invalida");
        }else{
            Tarefa tarefa = tarefas.get(posicao);

            tarefa.concluida = true;

            tarefas.set(posicao, tarefa);
        }
    }
}
