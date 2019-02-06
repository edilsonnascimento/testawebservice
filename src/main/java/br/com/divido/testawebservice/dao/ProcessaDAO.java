package br.com.divido.testawebservice.dao;

import br.com.divido.testawebservice.model.Usuario;
import javax.inject.Inject;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author ednascimento
 */
public class ProcessaDAO {

    @Inject
    UsuarioDAO usuarioDao;

    public Integer planilha(Workbook planilha, Integer codigo) {
        //aba
        Sheet sheet = planilha.getSheetAt(0);
        //Linha
        Row row = sheet.getRow(2);
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(codigo);
        for (int j = 0; j <= 15; j++) {

            Cell cell = row.getCell(j);

            switch (cell.getColumnIndex()) {
                case 0:
                    usuario.setNome(cell.getStringCellValue());
                    break;
                case 1:
                    usuario.setDocumentoNacional(cell.getStringCellValue());
                    break;
                case 2:
                    usuario.setEndereco(cell.getStringCellValue());
                    break;
                case 3:
                    usuario.setTelefone(cell.getStringCellValue());
                    break;
                case 4:
                    usuario.setEmail(cell.getStringCellValue());
                    break;
                case 5:
                    usuario.setContatoPrincipal(cell.getStringCellValue());
                    break;
                case 6:
                    usuario.setCargoContato(cell.getStringCellValue());
                    break;
                case 7:
                    usuario.setUsuarioAuvo(cell.getStringCellValue());
                    break;
                case 8:
                    usuario.setGrupos(cell.getStringCellValue());
                    break;
                case 9:
                    usuario.setSegmento(cell.getStringCellValue());
                    break;
                case 10:
                    usuario.setObservacao(cell.getStringCellValue());
                    break;
                case 11:
                    usuario.setLatitude(cell.getStringCellValue());
                    break;
                case 12:
                    usuario.setLongitutde(cell.getStringCellValue());
                    break;
                case 13:
                    usuario.setStatus(cell.getStringCellValue());
                    break;
                case 14:
                    usuario.setAnotacao(cell.getStringCellValue());
                    break;
                case 15:
                    usuario.setEquipesResponsaveis(cell.getStringCellValue());
                    break;
            }
            System.out.println(cell.getColumnIndex());
        }
        usuarioDao.salvar(usuario);

        return usuario.getIdUsuario();
    }

}
