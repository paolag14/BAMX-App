package com.application.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.application.app.databinding.ActivityAbarrotesBindingImpl;
import com.application.app.databinding.ActivityAlimentosBindingImpl;
import com.application.app.databinding.ActivityCanastaBasicaBindingImpl;
import com.application.app.databinding.ActivityCargandoBindingImpl;
import com.application.app.databinding.ActivityDineroBindingImpl;
import com.application.app.databinding.ActivityDonacionesBindingImpl;
import com.application.app.databinding.ActivityEmbutidosBindingImpl;
import com.application.app.databinding.ActivityFoodDonationsBindingImpl;
import com.application.app.databinding.ActivityFormularioDonaciNBindingImpl;
import com.application.app.databinding.ActivityFormularioOtroAlimentoBindingImpl;
import com.application.app.databinding.ActivityFrutasYverdurasBindingImpl;
import com.application.app.databinding.ActivityHigieneYLimpiezaBindingImpl;
import com.application.app.databinding.ActivityInicioBindingImpl;
import com.application.app.databinding.ActivityIniciooneBindingImpl;
import com.application.app.databinding.ActivityIniciozeroBindingImpl;
import com.application.app.databinding.ActivityMenPrincipalBindingImpl;
import com.application.app.databinding.ActivityMensajeDineroBindingImpl;
import com.application.app.databinding.ActivityMensajeDonaciNBindingImpl;
import com.application.app.databinding.ActivityQhacemosBindingImpl;
import com.application.app.databinding.ActivityRecetasFiltradasBindingImpl;
import com.application.app.databinding.ActivityRecetasIntentoBindingImpl;
import com.application.app.databinding.ActivityResumenFoodDonationsBindingImpl;
import com.application.app.databinding.ActivityResumenHigieneYlimpiezaBindingImpl;
import com.application.app.databinding.ActivitySelecciNAlimentosBindingImpl;
import com.application.app.databinding.ActivityStripeBindingImpl;
import com.application.app.databinding.ActivityVerRecetasBindingImpl;
import com.application.app.databinding.ActivityVoluntariadoBindingImpl;
import com.application.app.databinding.FragmentArticuloBindingImpl;
import com.application.app.databinding.FragmentVerRecetaBindingImpl;
import com.application.app.databinding.LayoutProgressDialogBindingImpl;
import com.application.app.databinding.RowListlabel1BindingImpl;
import com.application.app.databinding.RowListlabelBindingImpl;
import com.application.app.databinding.RowListrectanglefourteenBindingImpl;
import com.application.app.databinding.RowVoluntariadoBindingImpl;
import com.application.app.databinding.SpinnerItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYABARROTES = 1;

  private static final int LAYOUT_ACTIVITYALIMENTOS = 2;

  private static final int LAYOUT_ACTIVITYCANASTABASICA = 3;

  private static final int LAYOUT_ACTIVITYCARGANDO = 4;

  private static final int LAYOUT_ACTIVITYDINERO = 5;

  private static final int LAYOUT_ACTIVITYDONACIONES = 6;

  private static final int LAYOUT_ACTIVITYEMBUTIDOS = 7;

  private static final int LAYOUT_ACTIVITYFOODDONATIONS = 8;

  private static final int LAYOUT_ACTIVITYFORMULARIODONACIN = 9;

  private static final int LAYOUT_ACTIVITYFORMULARIOOTROALIMENTO = 10;

  private static final int LAYOUT_ACTIVITYFRUTASYVERDURAS = 11;

  private static final int LAYOUT_ACTIVITYHIGIENEYLIMPIEZA = 12;

  private static final int LAYOUT_ACTIVITYINICIO = 13;

  private static final int LAYOUT_ACTIVITYINICIOONE = 14;

  private static final int LAYOUT_ACTIVITYINICIOZERO = 15;

  private static final int LAYOUT_ACTIVITYMENPRINCIPAL = 16;

  private static final int LAYOUT_ACTIVITYMENSAJEDINERO = 17;

  private static final int LAYOUT_ACTIVITYMENSAJEDONACIN = 18;

  private static final int LAYOUT_ACTIVITYQHACEMOS = 19;

  private static final int LAYOUT_ACTIVITYRECETASFILTRADAS = 20;

  private static final int LAYOUT_ACTIVITYRECETASINTENTO = 21;

  private static final int LAYOUT_ACTIVITYRESUMENFOODDONATIONS = 22;

  private static final int LAYOUT_ACTIVITYRESUMENHIGIENEYLIMPIEZA = 23;

  private static final int LAYOUT_ACTIVITYSELECCINALIMENTOS = 24;

  private static final int LAYOUT_ACTIVITYSTRIPE = 25;

  private static final int LAYOUT_ACTIVITYVERRECETAS = 26;

  private static final int LAYOUT_ACTIVITYVOLUNTARIADO = 27;

  private static final int LAYOUT_FRAGMENTARTICULO = 28;

  private static final int LAYOUT_FRAGMENTVERRECETA = 29;

  private static final int LAYOUT_LAYOUTPROGRESSDIALOG = 30;

  private static final int LAYOUT_ROWLISTLABEL = 31;

  private static final int LAYOUT_ROWLISTLABEL1 = 32;

  private static final int LAYOUT_ROWLISTRECTANGLEFOURTEEN = 33;

  private static final int LAYOUT_ROWVOLUNTARIADO = 34;

  private static final int LAYOUT_SPINNERITEM = 35;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(35);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_abarrotes, LAYOUT_ACTIVITYABARROTES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_alimentos, LAYOUT_ACTIVITYALIMENTOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_canasta_basica, LAYOUT_ACTIVITYCANASTABASICA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_cargando, LAYOUT_ACTIVITYCARGANDO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_dinero, LAYOUT_ACTIVITYDINERO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_donaciones, LAYOUT_ACTIVITYDONACIONES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_embutidos, LAYOUT_ACTIVITYEMBUTIDOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_food_donations, LAYOUT_ACTIVITYFOODDONATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_formulario_donaci_n, LAYOUT_ACTIVITYFORMULARIODONACIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_formulario_otro_alimento, LAYOUT_ACTIVITYFORMULARIOOTROALIMENTO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_frutas_yverduras, LAYOUT_ACTIVITYFRUTASYVERDURAS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_higiene_y_limpieza, LAYOUT_ACTIVITYHIGIENEYLIMPIEZA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_inicio, LAYOUT_ACTIVITYINICIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_inicioone, LAYOUT_ACTIVITYINICIOONE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_iniciozero, LAYOUT_ACTIVITYINICIOZERO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_men_principal, LAYOUT_ACTIVITYMENPRINCIPAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_mensaje_dinero, LAYOUT_ACTIVITYMENSAJEDINERO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_mensaje_donaci_n, LAYOUT_ACTIVITYMENSAJEDONACIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_qhacemos, LAYOUT_ACTIVITYQHACEMOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_recetas_filtradas, LAYOUT_ACTIVITYRECETASFILTRADAS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_recetas_intento, LAYOUT_ACTIVITYRECETASINTENTO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_resumen_food_donations, LAYOUT_ACTIVITYRESUMENFOODDONATIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_resumen_higiene_ylimpieza, LAYOUT_ACTIVITYRESUMENHIGIENEYLIMPIEZA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_selecci_n_alimentos, LAYOUT_ACTIVITYSELECCINALIMENTOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_stripe, LAYOUT_ACTIVITYSTRIPE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_ver_recetas, LAYOUT_ACTIVITYVERRECETAS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.activity_voluntariado, LAYOUT_ACTIVITYVOLUNTARIADO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.fragment_articulo, LAYOUT_FRAGMENTARTICULO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.fragment_ver_receta, LAYOUT_FRAGMENTVERRECETA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.layout_progress_dialog, LAYOUT_LAYOUTPROGRESSDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_listlabel, LAYOUT_ROWLISTLABEL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_listlabel1, LAYOUT_ROWLISTLABEL1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_listrectanglefourteen, LAYOUT_ROWLISTRECTANGLEFOURTEEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.row_voluntariado, LAYOUT_ROWVOLUNTARIADO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.application.app.R.layout.spinner_item, LAYOUT_SPINNERITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYABARROTES: {
          if ("layout/activity_abarrotes_0".equals(tag)) {
            return new ActivityAbarrotesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_abarrotes is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYALIMENTOS: {
          if ("layout/activity_alimentos_0".equals(tag)) {
            return new ActivityAlimentosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_alimentos is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCANASTABASICA: {
          if ("layout/activity_canasta_basica_0".equals(tag)) {
            return new ActivityCanastaBasicaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_canasta_basica is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCARGANDO: {
          if ("layout/activity_cargando_0".equals(tag)) {
            return new ActivityCargandoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_cargando is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDINERO: {
          if ("layout/activity_dinero_0".equals(tag)) {
            return new ActivityDineroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dinero is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDONACIONES: {
          if ("layout/activity_donaciones_0".equals(tag)) {
            return new ActivityDonacionesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_donaciones is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEMBUTIDOS: {
          if ("layout/activity_embutidos_0".equals(tag)) {
            return new ActivityEmbutidosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_embutidos is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFOODDONATIONS: {
          if ("layout/activity_food_donations_0".equals(tag)) {
            return new ActivityFoodDonationsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_food_donations is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFORMULARIODONACIN: {
          if ("layout/activity_formulario_donaci_n_0".equals(tag)) {
            return new ActivityFormularioDonaciNBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_formulario_donaci_n is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFORMULARIOOTROALIMENTO: {
          if ("layout/activity_formulario_otro_alimento_0".equals(tag)) {
            return new ActivityFormularioOtroAlimentoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_formulario_otro_alimento is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYFRUTASYVERDURAS: {
          if ("layout/activity_frutas_yverduras_0".equals(tag)) {
            return new ActivityFrutasYverdurasBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_frutas_yverduras is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHIGIENEYLIMPIEZA: {
          if ("layout/activity_higiene_y_limpieza_0".equals(tag)) {
            return new ActivityHigieneYLimpiezaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_higiene_y_limpieza is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINICIO: {
          if ("layout/activity_inicio_0".equals(tag)) {
            return new ActivityInicioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_inicio is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINICIOONE: {
          if ("layout/activity_inicioone_0".equals(tag)) {
            return new ActivityIniciooneBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_inicioone is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINICIOZERO: {
          if ("layout/activity_iniciozero_0".equals(tag)) {
            return new ActivityIniciozeroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_iniciozero is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMENPRINCIPAL: {
          if ("layout/activity_men_principal_0".equals(tag)) {
            return new ActivityMenPrincipalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_men_principal is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMENSAJEDINERO: {
          if ("layout/activity_mensaje_dinero_0".equals(tag)) {
            return new ActivityMensajeDineroBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_mensaje_dinero is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMENSAJEDONACIN: {
          if ("layout/activity_mensaje_donaci_n_0".equals(tag)) {
            return new ActivityMensajeDonaciNBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_mensaje_donaci_n is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYQHACEMOS: {
          if ("layout/activity_qhacemos_0".equals(tag)) {
            return new ActivityQhacemosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_qhacemos is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRECETASFILTRADAS: {
          if ("layout/activity_recetas_filtradas_0".equals(tag)) {
            return new ActivityRecetasFiltradasBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_recetas_filtradas is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRECETASINTENTO: {
          if ("layout/activity_recetas_intento_0".equals(tag)) {
            return new ActivityRecetasIntentoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_recetas_intento is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRESUMENFOODDONATIONS: {
          if ("layout/activity_resumen_food_donations_0".equals(tag)) {
            return new ActivityResumenFoodDonationsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_resumen_food_donations is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRESUMENHIGIENEYLIMPIEZA: {
          if ("layout/activity_resumen_higiene_ylimpieza_0".equals(tag)) {
            return new ActivityResumenHigieneYlimpiezaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_resumen_higiene_ylimpieza is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSELECCINALIMENTOS: {
          if ("layout/activity_selecci_n_alimentos_0".equals(tag)) {
            return new ActivitySelecciNAlimentosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_selecci_n_alimentos is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSTRIPE: {
          if ("layout/activity_stripe_0".equals(tag)) {
            return new ActivityStripeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_stripe is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVERRECETAS: {
          if ("layout/activity_ver_recetas_0".equals(tag)) {
            return new ActivityVerRecetasBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_ver_recetas is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYVOLUNTARIADO: {
          if ("layout/activity_voluntariado_0".equals(tag)) {
            return new ActivityVoluntariadoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_voluntariado is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTARTICULO: {
          if ("layout/fragment_articulo_0".equals(tag)) {
            return new FragmentArticuloBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_articulo is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVERRECETA: {
          if ("layout/fragment_ver_receta_0".equals(tag)) {
            return new FragmentVerRecetaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_ver_receta is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTPROGRESSDIALOG: {
          if ("layout/layout_progress_dialog_0".equals(tag)) {
            return new LayoutProgressDialogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_progress_dialog is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWLISTLABEL: {
          if ("layout/row_listlabel_0".equals(tag)) {
            return new RowListlabelBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_listlabel is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWLISTLABEL1: {
          if ("layout/row_listlabel1_0".equals(tag)) {
            return new RowListlabel1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_listlabel1 is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWLISTRECTANGLEFOURTEEN: {
          if ("layout/row_listrectanglefourteen_0".equals(tag)) {
            return new RowListrectanglefourteenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_listrectanglefourteen is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWVOLUNTARIADO: {
          if ("layout/row_voluntariado_0".equals(tag)) {
            return new RowVoluntariadoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_voluntariado is invalid. Received: " + tag);
        }
        case  LAYOUT_SPINNERITEM: {
          if ("layout/spinner_item_0".equals(tag)) {
            return new SpinnerItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for spinner_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(21);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "alimentosVM");
      sKeys.put(2, "cargandoVM");
      sKeys.put(3, "dineroVM");
      sKeys.put(4, "donacionesVM");
      sKeys.put(5, "formularioDonaciNVM");
      sKeys.put(6, "formularioOtroAlimentoVM");
      sKeys.put(7, "higieneYLimpiezaVM");
      sKeys.put(8, "inicioVM");
      sKeys.put(9, "iniciooneVM");
      sKeys.put(10, "iniciozeroVM");
      sKeys.put(11, "listlabel1RowModel");
      sKeys.put(12, "listlabelRowModel");
      sKeys.put(13, "menPrincipalVM");
      sKeys.put(14, "mensajeDonaciNVM");
      sKeys.put(15, "message");
      sKeys.put(16, "qhacemosVM");
      sKeys.put(17, "recetasVM");
      sKeys.put(18, "selecciNAlimentosVM");
      sKeys.put(19, "voluntariadoRowModel");
      sKeys.put(20, "voluntariadoVM");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(35);

    static {
      sKeys.put("layout/activity_abarrotes_0", com.application.app.R.layout.activity_abarrotes);
      sKeys.put("layout/activity_alimentos_0", com.application.app.R.layout.activity_alimentos);
      sKeys.put("layout/activity_canasta_basica_0", com.application.app.R.layout.activity_canasta_basica);
      sKeys.put("layout/activity_cargando_0", com.application.app.R.layout.activity_cargando);
      sKeys.put("layout/activity_dinero_0", com.application.app.R.layout.activity_dinero);
      sKeys.put("layout/activity_donaciones_0", com.application.app.R.layout.activity_donaciones);
      sKeys.put("layout/activity_embutidos_0", com.application.app.R.layout.activity_embutidos);
      sKeys.put("layout/activity_food_donations_0", com.application.app.R.layout.activity_food_donations);
      sKeys.put("layout/activity_formulario_donaci_n_0", com.application.app.R.layout.activity_formulario_donaci_n);
      sKeys.put("layout/activity_formulario_otro_alimento_0", com.application.app.R.layout.activity_formulario_otro_alimento);
      sKeys.put("layout/activity_frutas_yverduras_0", com.application.app.R.layout.activity_frutas_yverduras);
      sKeys.put("layout/activity_higiene_y_limpieza_0", com.application.app.R.layout.activity_higiene_y_limpieza);
      sKeys.put("layout/activity_inicio_0", com.application.app.R.layout.activity_inicio);
      sKeys.put("layout/activity_inicioone_0", com.application.app.R.layout.activity_inicioone);
      sKeys.put("layout/activity_iniciozero_0", com.application.app.R.layout.activity_iniciozero);
      sKeys.put("layout/activity_men_principal_0", com.application.app.R.layout.activity_men_principal);
      sKeys.put("layout/activity_mensaje_dinero_0", com.application.app.R.layout.activity_mensaje_dinero);
      sKeys.put("layout/activity_mensaje_donaci_n_0", com.application.app.R.layout.activity_mensaje_donaci_n);
      sKeys.put("layout/activity_qhacemos_0", com.application.app.R.layout.activity_qhacemos);
      sKeys.put("layout/activity_recetas_filtradas_0", com.application.app.R.layout.activity_recetas_filtradas);
      sKeys.put("layout/activity_recetas_intento_0", com.application.app.R.layout.activity_recetas_intento);
      sKeys.put("layout/activity_resumen_food_donations_0", com.application.app.R.layout.activity_resumen_food_donations);
      sKeys.put("layout/activity_resumen_higiene_ylimpieza_0", com.application.app.R.layout.activity_resumen_higiene_ylimpieza);
      sKeys.put("layout/activity_selecci_n_alimentos_0", com.application.app.R.layout.activity_selecci_n_alimentos);
      sKeys.put("layout/activity_stripe_0", com.application.app.R.layout.activity_stripe);
      sKeys.put("layout/activity_ver_recetas_0", com.application.app.R.layout.activity_ver_recetas);
      sKeys.put("layout/activity_voluntariado_0", com.application.app.R.layout.activity_voluntariado);
      sKeys.put("layout/fragment_articulo_0", com.application.app.R.layout.fragment_articulo);
      sKeys.put("layout/fragment_ver_receta_0", com.application.app.R.layout.fragment_ver_receta);
      sKeys.put("layout/layout_progress_dialog_0", com.application.app.R.layout.layout_progress_dialog);
      sKeys.put("layout/row_listlabel_0", com.application.app.R.layout.row_listlabel);
      sKeys.put("layout/row_listlabel1_0", com.application.app.R.layout.row_listlabel1);
      sKeys.put("layout/row_listrectanglefourteen_0", com.application.app.R.layout.row_listrectanglefourteen);
      sKeys.put("layout/row_voluntariado_0", com.application.app.R.layout.row_voluntariado);
      sKeys.put("layout/spinner_item_0", com.application.app.R.layout.spinner_item);
    }
  }
}
