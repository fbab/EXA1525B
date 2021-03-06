<?php $dossier = $form->getObject() ?>
<h1><?php echo $dossier->isNew() ? 'Nouveau' : 'Edit' ?> Dossier</h1>

<form action="<?php echo url_for('dossier/update'.(!$dossier->isNew() ? '?id='.$dossier->getId() : '')) ?>" method="post" <?php $form->isMultipart() and print 'enctype="multipart/form-data" ' ?>>
  <table>
    <tfoot>
      <tr>
        <td colspan="2">
          &nbsp;<a href="<?php echo url_for('dossier/index') ?>">Cancel</a>
          <?php if (!$dossier->isNew()): ?>
            &nbsp;<?php echo link_to('Delete', 'dossier/delete?id='.$dossier->getId(), array('post' => true, 'confirm' => 'Are you sure?')) ?>
          <?php endif; ?>
        </td>
      </tr>
    </tfoot>
    <tbody>
      <?php echo $form->renderGlobalErrors() ?>


      <tr>
        <th><label>numéro de dossier :</label></th>
        <td>
          <?php echo $dossier->getNumLastDossier()?>
        </td>
      </tr>

      <tr>
        <th><label for="dossier_etat">Etat</label></th>
        <td>
          <?php echo $form['etat']->renderError() ?>
          <?php echo $form['etat'] ?>
        </td>
      </tr>     

      <tr>
        <th><label for="dossier_date_ouverture_dossier">Date ouverture dossier</label></th>
        <td>
          <?php echo $form['date_ouverture_dossier']->renderError() ?>
          <?php echo $form['date_ouverture_dossier'] ?>
        </td>
      </tr>
      <tr>
        
        <td>
          <?php echo $form['date_cloture_dossier']->renderError() ?>
          <?php echo $form['date_cloture_dossier'] ?>
        </td>
      </tr>
      <tr>
        <th><label for="dossier_type_dossier">Type dossier</label></th>
        <td>
          <?php echo $form['type_dossier']->renderError() ?>
          <?php echo $form['type_dossier'] ?>

        <?php echo $form['id'] ?>
        </td>
      </tr>
    </tbody>
  </table><br/>
          <input type="submit" value="Profil Personne" name="profilPersonne" />
          <input type="submit" value="Poursuivre clôture" name="poursuivreCloture"/>
</form>

