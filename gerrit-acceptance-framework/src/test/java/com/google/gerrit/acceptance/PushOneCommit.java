  private static AtomicInteger CHANGE_ID_COUNTER = new AtomicInteger();
    this(notesFactory, approvalsUtil, queryProvider, db, i, testRepo, subject, files, null);
  public void setTag(final Tag tag) {
      assertReviewers(c, expectedReviewers);
    private void assertReviewers(Change c, TestAccount... expectedReviewers) throws OrmException {
          approvalsUtil.getReviewers(db, notesFactory.createChecked(db, c)).all();