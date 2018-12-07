/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArchivesPackage;

import ModelPackage.User;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UserWriterManager {

    private BufferedWriter writer;

    public void open(String fileName) throws IOException {
        writer = new BufferedWriter(new FileWriter(fileName));
    }

    public void write(User user) throws IOException {
        writer.write(user.toFileString()+"\n" );
    }

    public void close() throws IOException {
        writer.close();
    }
}
