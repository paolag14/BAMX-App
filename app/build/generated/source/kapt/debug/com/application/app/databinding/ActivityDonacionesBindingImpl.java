package com.application.app.databinding;
import com.application.app.R;
import com.application.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDonacionesBindingImpl extends ActivityDonacionesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.linearDonaciones, 4);
        sViewsWithIds.put(R.id.frameStackbamxlogotwo, 5);
        sViewsWithIds.put(R.id.imageArrowleft, 6);
        sViewsWithIds.put(R.id.frameStackellipseone, 7);
        sViewsWithIds.put(R.id.linearColumndinero, 8);
        sViewsWithIds.put(R.id.btnDinero, 9);
        sViewsWithIds.put(R.id.btnAlimentos, 10);
        sViewsWithIds.put(R.id.btnHigieneLimpiezaOne, 11);
        sViewsWithIds.put(R.id.btnTiempo, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDonacionesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ActivityDonacionesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[10]
            , (androidx.appcompat.widget.AppCompatButton) bindings[9]
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (androidx.appcompat.widget.AppCompatButton) bindings[12]
            , (android.widget.FrameLayout) bindings[5]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.imageBamxlogoTwo.setTag(null);
        this.imageEllipseOne.setTag(null);
        this.linearColumnmask.setTag(null);
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
        if (BR.donacionesVM == variableId) {
            setDonacionesVM((com.application.app.modules.donaciones.data.viewmodel.DonacionesVM) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDonacionesVM(@Nullable com.application.app.modules.donaciones.data.viewmodel.DonacionesVM DonacionesVM) {
        this.mDonacionesVM = DonacionesVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.donacionesVM);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDonacionesVMDonacionesModel((androidx.lifecycle.MutableLiveData<com.application.app.modules.donaciones.data.model.DonacionesModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDonacionesVMDonacionesModel(androidx.lifecycle.MutableLiveData<com.application.app.modules.donaciones.data.model.DonacionesModel> DonacionesVMDonacionesModel, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<com.application.app.modules.donaciones.data.model.DonacionesModel> donacionesVMDonacionesModel = null;
        java.lang.String donacionesVMDonacionesModelTxtH5 = null;
        com.application.app.modules.donaciones.data.model.DonacionesModel donacionesVMDonacionesModelGetValue = null;
        com.application.app.modules.donaciones.data.viewmodel.DonacionesVM donacionesVM = mDonacionesVM;

        if ((dirtyFlags & 0x7L) != 0) {



                if (donacionesVM != null) {
                    // read donacionesVM.donacionesModel
                    donacionesVMDonacionesModel = donacionesVM.getDonacionesModel();
                }
                updateLiveDataRegistration(0, donacionesVMDonacionesModel);


                if (donacionesVMDonacionesModel != null) {
                    // read donacionesVM.donacionesModel.getValue()
                    donacionesVMDonacionesModelGetValue = donacionesVMDonacionesModel.getValue();
                }


                if (donacionesVMDonacionesModelGetValue != null) {
                    // read donacionesVM.donacionesModel.getValue().txtH5
                    donacionesVMDonacionesModelTxtH5 = donacionesVMDonacionesModelGetValue.getTxtH5();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageBamxlogoTwo, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageBamxlogoTwo.getContext(), R.drawable.img_bamxlogo2_224x300), (float)0f, (boolean)false);
            com.application.app.appcomponents.ui.CustomBindingAdapterKt.loadImageFromResource(this.imageEllipseOne, androidx.appcompat.content.res.AppCompatResources.getDrawable(imageEllipseOne.getContext(), R.drawable.img_ellipse1), (float)0f, (boolean)false);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtH5, donacionesVMDonacionesModelTxtH5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): donacionesVM.donacionesModel
        flag 1 (0x2L): donacionesVM
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}