package azterketa.db;

import azterketa.utils.Txanpona;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TxanponKud {

    private static TxanponKud instantzia = new TxanponKud();
    private DBKud dbkud = DBKud.getInstantzia();

    public static TxanponKud getInstance(){return instantzia;}

    private TxanponKud(){}

    public List<Txanpona> getTxanponak() throws SQLException {
        List<Txanpona> emaitza = new ArrayList<>();
        String eskaera = "SELECT id,data,balioa,mota,bolumena FROM txanponak";
        ResultSet rs = dbkud.execSQL(eskaera);
        while(rs.next()){
            int id = rs.getInt("id");
            Date data = rs.getDate("data");
            Float balioa = rs.getFloat("balioa");
            String mota = rs.getString("mota");
            Float bolumena = rs.getFloat("bolumena");
            Txanpona t = new Txanpona();
            t.setId(id);
            t.setIzena(mota);
            t.setData(data);
            t.setBalioa(balioa);
            t.setBolumena(bolumena);
            String i = bilatuJoera(t,emaitza);
            t.setJoera(i);
            emaitza.add(t);
        }
        return emaitza;
    }

    private String bilatuJoera(Txanpona t, List<Txanpona> emaitza) {
        String mota = t.getIzena();
        Txanpona aux = new Txanpona();
        aux.setIzena("Nulua");
        if(emaitza.isEmpty()){
            return "gorakorra";
        }
        else{
            for (int i = 0;i<emaitza.size();i++){
                Txanpona lag = emaitza.get(i);
                if(lag.getIzena().equals(mota)){
                    aux = lag;
                }
            }
            if(aux.getIzena().equals("Nulua") || aux.getBalioa()<t.getBalioa()){
                return "gorakorra";
            }
            else{
                if(aux.getBalioa()>t.getBalioa()){
                    return "beherakorra";
                }
                else{
                    return "berdina";
                }
            }
        }
    }
}
