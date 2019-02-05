package br.com.divido.testawebservice.resource;

import java.io.IOException;
import java.io.InputStream;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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

    @POST
    @Path("planilha")
    @Consumes("multipart/form-data")
    public Response uploadFile(MultipartFormDataInput input) throws IOException {

        InputStream in = input.getFormDataPart("arquivo", InputStream.class, null);
        Workbook workbook = new XSSFWorkbook(in);

        return Response.status(201).build();
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
