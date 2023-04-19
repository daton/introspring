package educarvr.introspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SecuenciasServicio {
    @Autowired
    private  SecuenciaDao secuenciaDao;
    public  void setDao(SecuenciaDao secuenciasDao){
     this.secuenciaDao=secuenciaDao;
    }
    public String generar(String secuenciaId){
        Secuencia secuencia=secuenciaDao.getSecuencia(secuenciaId);
        int valor=secuenciaDao.getProximoVal(secuenciaId);
        return  secuencia.getPrefijo()+valor+secuencia.getSufijo();
    }
}
