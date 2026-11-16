void main() {
    Desarrollador desarrollador1 = new Desarrollador("D01", "Ana", "Backend", 20);
    Desarrollador desarrollador2 = new Desarrollador("D02", "Luis", "Frontend", 15);
    Desarrollador desarrollador3 = new Desarrollador("D03", "Sofía", "Pruebas", 10);

    Proyecto proyecto = new Proyecto("Sistema de ventas");

    System.out.println(proyecto.mostrarEquipo());

    proyecto.agregarDesarrollador(desarrollador1);
    proyecto.agregarDesarrollador(desarrollador2);
    proyecto.agregarDesarrollador(desarrollador3);
    System.out.println(proyecto.mostrarEquipo());

    Desarrollador encontrado = proyecto.buscarDesarrollador("D02");
    System.out.println(encontrado.mostrarInformacion());

    System.out.println(proyecto.buscarDesarrollador("D99"));

    System.out.println(proyecto.eliminarDesarrollador("D02"));
    System.out.println(proyecto.mostrarEquipo());

    System.out.println(proyecto.calcularTotalHoras());
}
