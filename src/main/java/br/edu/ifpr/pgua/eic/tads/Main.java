package br.edu.ifpr.pgua.eic.tads;

import java.util.ArrayList;
import br.edu.ifpr.pgua.eic.tads.models.*;
import br.edu.ifpr.pgua.eic.tads.controllers.IndexController;
import br.edu.ifpr.pgua.eic.tads.utils.JavalinUtils;
import io.javalin.Javalin;

public class Main { // simulando banco de dados
    public static ArrayList<Contato> databaseContato = new ArrayList<>();
    public static void main(String[] args) {
        Contato contato = new Contato("augusto", "123@gmail.com", "12344321");
        Agenda agenda = new Agenda("INFO24", "online");
        agenda.adicionarContato(contato);
        System.out.println(agenda);
    }
}