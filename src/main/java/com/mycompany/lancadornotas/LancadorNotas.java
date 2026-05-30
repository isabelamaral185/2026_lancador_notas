/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lancadornotas;
import com.formdev.flatlaf.FlatLightLaf; // Importa o FlatLaf e testa pra saber se deu certo.

import com.mycompany.lancadornotas.view.Principal; // Precisa importar a classe Principal pois elas estão em pastas diferentes.

// Essas duas pastas são criadas dentro da LancadorNotas.
// Ele criou um pacote novo com o nome de "model". Dentro dela você cria uma classe chamada Aluno.
// Ele criou outro pacote, mas dessa vez com o nome de "view". Dentro dela você cria uma JFrame chamada Principal.

public class LancadorNotas {

    public static void main(String[] args) {
        
        FlatLightLaf.setup();
        System.out.println("teste");
        
        new Principal().setVisible(true); // Aqui vai fazer com que a jFrame apareça na tela, antes não aparecia pois a main é a LancadorNotas.
    }
}
