package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivitySelecciNAlimentosBindingImpl extends ActivitySelecciNAlimentosBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearColumnmask, 9);
        sViewsWithIds.put(R.id.frameSystembar, 10);
        sViewsWithIds.put(R.id.imageMask, 11);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 12);
        sViewsWithIds.put(R.id.frameStackbamxlogotwoOne, 13);
        sViewsWithIds.put(R.id.frameStackarrowleft, 14);
        sViewsWithIds.put(R.id.imageArrowleft, 15);
        sViewsWithIds.put(R.id.linearColumnzero, 16);
        sViewsWithIds.put(R.id.btnDonar, 17);
        sViewsWithIds.put(R.id.frameBottombar, 18);
        sViewsWithIds.put(R.id.linear2FourupAO, 19);
        sViewsWithIds.put(R.id.linear1Tab, 20);
        sViewsWithIds.put(R.id.imageHome, 21);
        sViewsWithIds.put(R.id.linearColumnvolume, 22);
        sViewsWithIds.put(R.id.linear3Tab, 23);
        sViewsWithIds.put(R.id.imageVolume, 24);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivitySelecciNAlimentosBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private ActivitySelecciNAlimentosBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[17]
            , (android.widget.FrameLayout) bindings[18]
            , (android.widget.FrameLayout) bindings[14]
            , (android.widget.FrameLayout) bindings[12]
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[10]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[4]
            );
        this.imageBamxlogoTwo.setTag(null);
        this.imageBamxlogoTwoOne.setTag(null);
        this.imageImageFiftyOne.setTag(null);
        this.linearSeleccinalime.setTag(null);
        this.recyclerListnaranja.setTag(null);
        this.recyclerListrectanglefourteen.setTag(null);
        this.txtCaption.setTag(null);
        this.txtCaptionOne.setTag(null);
        this.txtH5.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.selecciNAlimentosVM == variableId) {
            setSelecciNAlimentosVM((com.application.app.modules.seleccinalimentos.data.viewmodel.SelecciNAlimentosVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSelecciNAlimentosVM(@Nullable com.application.app.modules.seleccinalimentos.data.viewmodel.SelecciNAlimentosVM SelecciNAlimentosVM) {
        this.mSelecciNAlimentosVM = SelecciNAlimentosVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.selecciNAlimentosVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSelecciNAlimentosVMSelecciNAlimentosModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.seleccinalimentos.data.model.SelecciNAlimentosModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSelecciNAlimentosVMSelecciNAlimentosModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.seleccinalimentos.data.model.SelecciNAlimentosModel> SelecciNAlimentosVMSelecciNAlimentosModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String selecciNAlimentosVMSelecciNAlimentosModelFruta = null;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.seleccinalimentos.data.model.SelecciNAlimentosModel> selecciNAlimentosVMSelecciNAlimentosModel = null;
        java.lang.String selecciNAlimentosVMSelecciNAlimentosModelTxtCaptionOne = null;
        java.lang.String selecciNAlimentosVMSelecciNAlimentosModelTxtCaption = null;
        com.application.app.modules.seleccinalimentos.data.model.SelecciNAlimentosModel selecciNAlimentosVMSelecciNAlimentosModelGetValue = null;
        com.application.app.modules.seleccinalimentos.data.viewmodel.SelecciNAlimentosVM selecciNAlimentosVM = mSelecciNAlimentosVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (selecciNAlimentosVM != null) {
                    // read selecciNAlimentosVM.selecciNAlimentosModel
                    selecciNAlimentosVMSelecciNAlimentosModel = selecciNAlimentosVM.getSelecciNAlimentosModel();
                }
                updateLiveDataRegistration(0, selecciNAlimentosVMSelecciNAlimentosModel);


                if (selecciNAlimentosVMSelecciNAlimentosModel != null) {
                    // read selecciNAlimentosVM.selecciNAlimentosModel.getValue()
                    selecciNAlimentosVMSelecciNAlimentosModelGetValue = selecciNAlimentosVMSelecciNAlimentosModel.getValue();
                }


                if (selecciNAlimentosVMSelecciNAlimentosModelGetValue != null) {
                    // read selecciNAlimentosVM.selecciNAlimentosModel.getValue().fruta
                    selecciNAlimentosVMSelecciNAlimentosModelFruta = selecciNAlimentosVMSelecciNAlimentosModelGetValue.getFruta();
                    // read selecciNAlimentosVM.selecciNAlimentosModel.getValue().txtCaptionOne
                    selecciNAlimentosVMSelecciNAlimentosModelTxtCaptionOne = selecciNAlimentosVMSelecciNAlimentosModelGetValue.getTxtCaptionOne();
                    // read selecciNAlimentosVM.selecciNAlimentosModel.getValue().txtCaption
                    selecciNAlimentosVMSelecciNAlimentosModelTxtCaption = selecciNAlimentosVMSelecciNAlimentosModelGetValue.getTxtCaption();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_4), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwoOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwoOne.getContext(), R.drawable.img_bamxlogo2_5), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageImageFiftyOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageImageFiftyOne.getContext(), R.drawable.img_image51), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerListnaranja, recyclerListnaranja.getResources().getDimension(R.dimen._22pxh), (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerListrectanglefourteen, recyclerListrectanglefourteen.getResources().getDimension(R.dimen._22pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaption, selecciNAlimentosVMSelecciNAlimentosModelTxtCaption);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaptionOne, selecciNAlimentosVMSelecciNAlimentosModelTxtCaptionOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtH5, selecciNAlimentosVMSelecciNAlimentosModelFruta);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): selecciNAlimentosVM.selecciNAlimentosModel
        flag 1 (0x2L): selecciNAlimentosVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}