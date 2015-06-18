package editor_code;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.DefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;

public class ECLSourceViewerConfig extends TextSourceViewerConfiguration {

  public ECLSourceViewerConfig() {
    this(null);
  }

  public ECLSourceViewerConfig(IPreferenceStore preferenceStore) {
    super(preferenceStore);    
    // enable auto activation
  }

  @Override
  public IContentAssistant getContentAssistant(ISourceViewer sourceViewer) {
	  
      ContentAssistant ca = new ContentAssistant();
      IContentAssistProcessor cap = new ECLCompletionProcessor() ;
      ca.setContentAssistProcessor(cap, IDocument.DEFAULT_CONTENT_TYPE);
      ca.setInformationControlCreator(getInformationControlCreator(sourceViewer));
      ca.enableAutoActivation(true);
      ca.setAutoActivationDelay(0);
      return ca;
  }
  
  @Override
  public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {

		PresentationReconciler pr = new PresentationReconciler();
        DefaultDamagerRepairer ddr = new DefaultDamagerRepairer(new ECLScanner());
        pr.setRepairer(ddr, IDocument.DEFAULT_CONTENT_TYPE);
        pr.setDamager(ddr, IDocument.DEFAULT_CONTENT_TYPE);
		return pr;
	}
  
  @Override
  public IAutoEditStrategy[] getAutoEditStrategies(ISourceViewer sourceViewer, 
		    String contentType) {
      IAutoEditStrategy strategy= (IDocument.DEFAULT_CONTENT_TYPE.equals(contentType) 
      ? new ECLAutoEdit() : new DefaultIndentLineAutoEditStrategy());
      IAutoEditStrategy indent= (IDocument.DEFAULT_CONTENT_TYPE.equals(contentType) 
    	      ? new ECLAutoindent() : new DefaultIndentLineAutoEditStrategy());
      return new IAutoEditStrategy[] { strategy  , indent} ;  
  }
  
  


  
} 