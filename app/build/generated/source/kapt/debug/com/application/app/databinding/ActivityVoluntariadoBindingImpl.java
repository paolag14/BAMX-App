package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityVoluntariadoBindingImpl extends ActivityVoluntariadoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearVoluntariado, 8);
        sViewsWithIds.put(R.id.frameStack, 9);
        sViewsWithIds.put(R.id.linearColumn, 10);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 11);
        sViewsWithIds.put(R.id.frameStackbamxlogotwoOne, 12);
        sViewsWithIds.put(R.id.frameStackarrowleft, 13);
        sViewsWithIds.put(R.id.imageArrowleft, 14);
        sViewsWithIds.put(R.id.btnEnviar, 15);
        sViewsWithIds.put(R.id.frameBottombar, 16);
        sViewsWithIds.put(R.id.linear2FourupAO, 17);
        sViewsWithIds.put(R.id.linear1Tab, 18);
        sViewsWithIds.put(R.id.imageHome, 19);
        sViewsWithIds.put(R.id.linearColumnvolume, 20);
        sViewsWithIds.put(R.id.linear3Tab, 21);
        sViewsWithIds.put(R.id.imageVolume, 22);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityVoluntariadoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private ActivityVoluntariadoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[15]
            , (android.widget.FrameLayout) bindings[16]
            , (android.widget.FrameLayout) bindings[9]
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.FrameLayout) bindings[11]
            , (android.widget.FrameLayout) bindings[12]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[21]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[1]
            );
        this.imageBamxlogoTwo.setTag(null);
        this.imageBamxlogoTwoOne.setTag(null);
        this.linearColumnmask.setTag(null);
        this.recyclerVoluntariado.setTag(null);
        this.txtAyudaalosque.setTag(null);
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
        if (BR.voluntariadoVM == variableId) {
            setVoluntariadoVM((com.application.app.modules.voluntariado.data.viewmodel.VoluntariadoVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVoluntariadoVM(@Nullable com.application.app.modules.voluntariado.data.viewmodel.VoluntariadoVM VoluntariadoVM) {
        this.mVoluntariadoVM = VoluntariadoVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.voluntariadoVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVoluntariadoVMVoluntariadoModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.voluntariado.data.model.VoluntariadoModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVoluntariadoVMVoluntariadoModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.voluntariado.data.model.VoluntariadoModel> VoluntariadoVMVoluntariadoModel, int fieldId) {
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
        java.lang.String voluntariadoVMVoluntariadoModelTxtCaptionOne = null;
        java.lang.String voluntariadoVMVoluntariadoModelTxtH5 = null;
        com.application.app.modules.voluntariado.data.model.VoluntariadoModel voluntariadoVMVoluntariadoModelGetValue = null;
        com.application.app.modules.voluntariado.data.viewmodel.VoluntariadoVM voluntariadoVM = mVoluntariadoVM;
        androidx.lifecycle.MutableLiveData<com.application.app.modules.voluntariado.data.model.VoluntariadoModel> voluntariadoVMVoluntariadoModel = null;
        java.lang.String voluntariadoVMVoluntariadoModelTxtCaption = null;
        java.lang.String voluntariadoVMVoluntariadoModelTxtAyudaalosque = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (voluntariadoVM != null) {
                    // read voluntariadoVM.voluntariadoModel
                    voluntariadoVMVoluntariadoModel = voluntariadoVM.getVoluntariadoModel();
                }
                updateLiveDataRegistration(0, voluntariadoVMVoluntariadoModel);


                if (voluntariadoVMVoluntariadoModel != null) {
                    // read voluntariadoVM.voluntariadoModel.getValue()
                    voluntariadoVMVoluntariadoModelGetValue = voluntariadoVMVoluntariadoModel.getValue();
                }


                if (voluntariadoVMVoluntariadoModelGetValue != null) {
                    // read voluntariadoVM.voluntariadoModel.getValue().txtCaptionOne
                    voluntariadoVMVoluntariadoModelTxtCaptionOne = voluntariadoVMVoluntariadoModelGetValue.getTxtCaptionOne();
                    // read voluntariadoVM.voluntariadoModel.getValue().txtH5
                    voluntariadoVMVoluntariadoModelTxtH5 = voluntariadoVMVoluntariadoModelGetValue.getTxtH5();
                    // read voluntariadoVM.voluntariadoModel.getValue().txtCaption
                    voluntariadoVMVoluntariadoModelTxtCaption = voluntariadoVMVoluntariadoModelGetValue.getTxtCaption();
                    // read voluntariadoVM.voluntariadoModel.getValue().txtAyudaalosque
                    voluntariadoVMVoluntariadoModelTxtAyudaalosque = voluntariadoVMVoluntariadoModelGetValue.getTxtAyudaalosque();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_14), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwoOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwoOne.getContext(), R.drawable.img_bamxlogo2_15), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.addSpaceBetweenRecyclerItem(this.recyclerVoluntariado, recyclerVoluntariado.getResources().getDimension(R.dimen._22pxh), (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAyudaalosque, voluntariadoVMVoluntariadoModelTxtAyudaalosque);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaption, voluntariadoVMVoluntariadoModelTxtCaption);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtCaptionOne, voluntariadoVMVoluntariadoModelTxtCaptionOne);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtH5, voluntariadoVMVoluntariadoModelTxtH5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): voluntariadoVM.voluntariadoModel
        flag 1 (0x2L): voluntariadoVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}