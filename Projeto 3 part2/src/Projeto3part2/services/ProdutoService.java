
package Projeto3part2.services;

import Projeto3part2.services.generic.GenericService;
import Projeto3part2.dao.IProdutoDAO;
import Projeto3part2.domain.Produto;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}