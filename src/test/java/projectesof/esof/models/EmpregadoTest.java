package projectesof.esof.models;


import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpregadoTest {
    @Test
    void adicionarTarefa(){

        Empregado empregado = new Empregado();
        empregado.setEmail("vasco@email.com");
        empregado.setName("Diogo");
        empregado.setCargo(Empregado.Cargo.AnalistaJunior);

        Tarefa tarefa = new Tarefa();

        tarefa.setName("tarefa1");
        tarefa.setDias(0);
        tarefa.setHoras(2);
        tarefa.setMinutos(0);
        tarefa.setTempoEstimado(Duration.ofDays(tarefa.getDias()).plusHours(tarefa.getHoras()).plusMinutes(tarefa.getMinutos()));

        empregado.adicionarTarefa(tarefa);
        assertEquals(1,empregado.getTarefas().size());


    }

}
