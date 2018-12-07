/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivesPackage;

/**
 *
 * @author Hansy Gonzalez
 */
import ModelPackage.User;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserReaderManager {

    private BufferedReader reader;

    public void open(String fileName) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(fileName));
    }

    public User read() throws IOException {
        User usuario = null;
        String line = reader.readLine(); //retorna null cuando no hay más registros
        String datos[];
        if (line != null) {
            usuario = new User();
            datos = line.split("-");
            usuario.setUserName(datos[0]); // lee el nombre de usuario
            usuario.setPassword(datos[1]); // lee la contraseña
            
        }
        return usuario;
    }

    public void close() throws IOException {
        reader.close();
    }
}
