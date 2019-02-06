package br.com.divido.testawebservice.resource;

import br.com.divido.testawebservice.dao.ProcessaDAO;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import javax.inject.Inject;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

/**
 *
 * @author ednascimento
 */
@Path("importar")
public class ImportacaoResource {

    @Inject
    ProcessaDAO processa;

    @POST
    @Path("planilha")
    @Consumes("multipart/form-data")
    public Response uploadFile(MultipartFormDataInput input, @QueryParam("codigo") Integer codigo) throws IOException {

        //InputStream
        InputStream in = input.getFormDataPart("arquivo", InputStream.class, null);
        //Planilha
        Workbook workbook = new XSSFWorkbook(in);

        in.close();

        URI uri = URI.create("/usuario/" + processa.planilha(workbook, codigo));

        return Response.created(uri).build();
    }

    @POST
    @Path("arquivobin")
    public Response uploadFile(InputStream input) throws IOException {

        return Response.status(201).build();
    }

    @GET
    public Response getTeste() {
        return Response.status(200).build();
    }

}
