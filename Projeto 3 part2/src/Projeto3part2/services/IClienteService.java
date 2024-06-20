/**
 *
 */
package Projeto3part2.services;

import Projeto3part2.exceptions.DAOException;
import Projeto3part2.services.generic.IGenericService;
import Projeto3part2.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}