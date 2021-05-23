package cadenacomercial;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Image;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileOutputStream;

public class Facturacion {

    Document documento = new Document();
    String lista = "";

    public void Facturar(String productos) {
        this.lista = productos;

        try {

            PdfWriter pdfw = PdfWriter.getInstance(documento, new FileOutputStream("Factura.pdf"));
            documento.open();
            Font fuente = new Font(FontFamily.HELVETICA);
            fuente.setSize(25);
            fuente.setColor(226, 42, 42);
            Font fuenteD = new Font(FontFamily.TIMES_ROMAN);
            fuenteD.setSize(12);
            fuenteD.setColor(99, 107, 3);

            Image imagen = Image.getInstance("C:\\Users\\andres\\Documents\\NetBeansProjects\\CadenaComercial\\src\\img\\oxxin.png");
            imagen.scalePercent(8, 8);
            imagen.setAbsolutePosition(10f, 750f);
            Image imagentwo = Image.getInstance("C:\\Users\\andres\\Documents\\NetBeansProjects\\CadenaComercial\\src\\img\\table.png");
            imagentwo.scalePercent(12, 12);
            imagentwo.setAbsolutePosition(450f, 735f);
            //Chunk img = new Chunk(imagen,5,5,true);
            Paragraph slice = new Paragraph("Cadena Comercial OXXO,S.A DE C.V\n"
                    + "VILLA UNION 9712 COLONIA GRANJAS \n"
                    + "R.F.C CCCF393222F", fuenteD);
            slice.setAlignment(Element.ALIGN_CENTER);
            documento.add(imagen);
            documento.add(imagentwo);
            documento.add(slice);
            //Hacer la tabla una imagen para poder moverla mejor.
            PdfPTable tabla = new PdfPTable(1);
            tabla.setWidthPercentage(10F);
            tabla.setHorizontalAlignment(Element.ALIGN_RIGHT);
            //tal vez mas grande
            //HACER HACIA ARRIBA.
            /*
            tabla.setTotalWidth(85f);
            tabla.setLockedWidth(true);
            tabla.getDefaultCell().setBorder(PdfPCell.NO_BORDER);
            PdfPCell celdaT = new PdfPCell(new Paragraph("Lugar de Expedicion"));
            celdaT.setHorizontalAlignment(Element.ALIGN_CENTER);
            celdaT.setBackgroundColor(BaseColor.ORANGE);
            tabla.addCell(celdaT);
            PdfPCell celdaU = new PdfPCell(new Paragraph("Villa Dorada \n"
                    + "Ciudad de Chihuahua\n"
                    + "Chihuahua 31114"));
            celdaT.setBackgroundColor(BaseColor.DARK_GRAY);
            tabla.addCell(celdaU);
            documento.add(tabla);
            */
            Paragraph title = new Paragraph("Facturacion Empresa OXXO", fuente);
            title.setAlignment(Element.ALIGN_CENTER);

            documento.add(title);
            /*
                for(int i = 0;i<2;i++){
                documento.add(new Paragraph("Facturacion OXXO",fuente));    
                }
                documento.add(new Paragraph("Facturacion OXXO",fuente));
             */
            //Posible array para poder poner la lista de productos, cuidao.
            //o sea vamos a ir llenando cada array y generando un list en cada una de las vueltas
            Font fuenteL = new Font(FontFamily.COURIER);
            fuenteL.setSize(18);
            fuenteL.setColor(13, 50, 168);
            Paragraph abs = new Paragraph("\n\n\n\n\n\n"+lista, fuenteL);
            abs.setAlignment(Element.ALIGN_CENTER);
            documento.add(abs);

            //Codigo de Barras
            BarcodeEAN code = new BarcodeEAN();
            code.setCodeType(code.EAN13);
            code.setCode("9781935182610");
            Image codeb = code.createImageWithBarcode(pdfw.getDirectContent(), null, null);
            codeb.scalePercent(150, 150);
            codeb.setAbsolutePosition(235f, 45f);
            documento.add(codeb);
            //

            documento.close();

        } catch (DocumentException ex) {
            System.out.println("NO jalo");
        } catch (java.io.IOException ex) {
            System.out.println("NO jalo");
        }
    }
}
