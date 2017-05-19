/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ibiruba.inf.bd;

import br.ibiruba.inf.beans.Cidade;
import java.util.List;

/**
 *
 * @author labin
 */
public interface PopulaBD {
    
    public void populaBD(List<Cidade> cidades);
}
