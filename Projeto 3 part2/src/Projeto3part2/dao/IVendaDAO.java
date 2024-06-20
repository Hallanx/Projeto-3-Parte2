
package Projeto3part2.dao;

import Projeto3part2.dao.generic.IGenericDAO;
import Projeto3part2.domain.Venda;
import Projeto3part2.exceptions.DAOException;
import Projeto3part2.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}