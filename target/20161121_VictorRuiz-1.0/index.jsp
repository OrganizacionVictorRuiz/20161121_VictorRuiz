<%-- 
    Document   : index
    Created on : 21-nov-2016, 10:41:29
    Author     : Zack
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- 
    Document   : index
    Created on : 17-nov-2016, 17:13:00
    Author     : Zack
-->


    


        <link rel="stylesheet" type="text/css" href="CSS/css.css" />

            <img src="IMG/logo.png" alt="" />
        <title>Pagina de Seguros</title>
        <form action="JSP/Controladores/Eleccion.jspx" method="post">
            <legend><h1>¡ Contrate nuestro seguro !</h1></legend>
            <fieldset>
            <h3 id="inicio">Elegir el seguro de los edificios, seguro de contenido, o ambos, marcando las casillas que se muestran a continuacion</h3>
            <p>¿Qué tipo de seguro quiere?</p>
            <input type="checkbox" name="seleccion" value="1" checked="" />
            <label for="edificios">Seguro de edificios</label><br/>
            <input type="checkbox" name="seleccion" value="2" checked="" />
            <label for="contenido">Seguro de contenido</label>
            <br/><br/>
            <input type="submit" name="enviar" value="Continuar" />
            </fieldset>
        </form>
        <div id="copyright">Victor Ruiz Sanchez S.L Since 2017</div>


